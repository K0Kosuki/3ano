-- a)
SELECT P.ID_Pessoa, P.Nome
FROM Pessoa P
WHERE P.ID_Pessoa NOT IN (
                            SELECT G.Id_Pessoa
                             FROM Gestao_de_convite G
                            WHERE G.aceita_or_recusado = 'aceita'
)
-- b)
SELECT DISTINCT P.ID_Pessoa, P.Nome
FROM Pessoa P
WHERE P.ID_Pessoa IN (SELECT H.Id_Pessoa
    FROM Historia_de_convite H
    WHERE H.Id_convite IN (SELECT G.Id_covite
  FROM Gestao_de_convite G
 WHERE G.Id_Pessoa IN (SELECT ID_Pessoa
            FROM Pessoa
            WHERE Genero = P.Genero ))
)