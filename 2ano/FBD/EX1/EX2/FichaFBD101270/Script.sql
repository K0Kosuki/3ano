CREATE TABLE Pessoa (
  ID_Pessoa INT PRIMARY KEY,
  Nome VARCHAR(20),
  Genero VARCHAR(10),
  Data_nac DATE,
  Altura INT,
  Habilitacao VARCHAR(30),
  Id_caract INT,
  FOREIGN KEY (Id_caract) REFERENCES Caracteristica(Id_caract)
);

CREATE TABLE Caracteristica (
  Id_caract INT PRIMARY KEY,
  Virtude VarChar(20),
  Defeito VARCHAR(20)
);
CREATE TABLE Saldo (
  Id_saldo INT PRIMARY KEY,
  Id_Pessoa INT ,
  Estado_saldo VARCHAR(20),
  Saldo INT,
  FOREIGN KEY (Id_Pessoa) REFERENCES Pessoa(Id_Pessoa)
);

CREATE TABLE Gestao_de_convite(
  Id_covite INT PRIMARY KEY,
  Id_Pessoa INT,--quem vai ser  convitado
  Id_saldo INT,
  Id_caract INT,
   aceita_or_recusado Varchar(20),
   Custo INT,
    FOREIGN KEY (Id_Pessoa) REFERENCES Pessoa(Id_Pessoa),
    FOREIGN KEY (Id_caract) REFERENCES Caracteristica(Id_caract),
    FOREIGN KEY (Id_saldo) REFERENCES Saldo(Id_saldo)
);
CREATE TABLE Historia_de_convite
(
    Id_Pessoa INT, -- quem lancou este convite--
    Id_convite INT,
   
    Numero_de_aceitar INT DEFAULT 0,
    Numero_de_recusado INT DEFAULT 0,
    CONSTRAINT chave_primaria_Historia PRIMARY KEY (Id_Pessoa),
    CONSTRAINT chave_estrangeira_Historia FOREIGN KEY (Id_convite) REFERENCES Gestao_de_convite (Id_covite) ON UPDATE CASCADE ON DELETE SET NULL
);