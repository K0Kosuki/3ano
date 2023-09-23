-------------D
CREATE FUNCTION rendimento(p_id_pessoa INT)
RETURNS INT
BEGIN
DECLARE rendimento_total INT;
SELECT SUM(Custo) INTO rendimento_total
FROM Gestao_de_convite
WHERE Id_Pessoa = p_id_pessoa;
SET rendimento_total = rendimento_total + (SELECT SUM(G.Custo)
 FROM Gestao_de_convite G
 WHERE G.Id_covite IN 
(
  SELECT Id_convite
FROM Historia_de_convite
   WHERE Id_Pessoa = p_id_pessoa));
  
  RETURN IFNULL(rendimento_total, 0);
END;
---Resultado:
SELECT rendimento(ID_Pessoa)
FROM Pessoa

------------------E
CREATE PROCEDURE convidar(p_id_convidante INT, p_id_convidado INT)
BEGIN
DECLARE v_id_covite INT;
 DECLARE v_id_saldo INT;

UPDATE Historia_de_convite 
SET Id_convite = v_id_covite 
WHERE Id_Pessoa = p_id_convidante;
INSERT INTO Historia_de_convite(Id_Pessoa, Id_convite)
END
