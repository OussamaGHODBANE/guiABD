
-- Création de la table Hotel
CREATE TABLE Hotel (
                       CodeH INT PRIMARY KEY,
                       NomH VARCHAR(255) NOT NULL
);

-- Création de la table Chambre
CREATE TABLE Chambre (
                         NumCh INT PRIMARY KEY,
                         DescCH VARCHAR(255),
                         TypeCh VARCHAR(50),
                         PrixCh DECIMAL(10, 2),
                         CategorieCode INT,
                         HotelCode INT,
                         FOREIGN KEY (CategorieCode) REFERENCES Categorie(CodeCat),
                         FOREIGN KEY (HotelCode) REFERENCES Hotel(CodeH)
);

-- Création de la table Categorie
CREATE TABLE Categorie (
                           CodeCat INT PRIMARY KEY,
                           Description VARCHAR(255)
);

-- Création de la table Employe
CREATE TABLE Employe (
                         CodeEmp INT PRIMARY KEY,
                         NomEmp VARCHAR(50),
                         PrenomEmp VARCHAR(50),
                         AdrEmp VARCHAR(255),
                         SalaireEmp DECIMAL(10, 2),
                         HotelCode INT,
                         FOREIGN KEY (HotelCode) REFERENCES Hotel(CodeH)
);

-- Création de la table Gere
CREATE TABLE Gere (
                      ChambreNum INT,
                      EmployeCode INT,
                      FOREIGN KEY (ChambreNum) REFERENCES Chambre(NumCh),
                      FOREIGN KEY (EmployeCode) REFERENCES Employe(CodeEmp),
                      PRIMARY KEY (ChambreNum, EmployeCode)
);

-- Création de la table Service
CREATE TABLE Service (
                         IdS INT PRIMARY KEY,
                         NomS VARCHAR(255),
                         PrixS DECIMAL(10, 2)
);

-- Création de la table Execute
CREATE TABLE Execute (
                         EmployeCode INT,
                         ServiceId INT,
                         FOREIGN KEY (EmployeCode) REFERENCES Employe(CodeEmp),
                         FOREIGN KEY (ServiceId) REFERENCES Service(IdS),
                         PRIMARY KEY (EmployeCode, ServiceId)
);

-- Création de la table Client
CREATE TABLE Client (
                        CodeCl INT PRIMARY KEY,
                        NomCl VARCHAR(50),
                        PrenomCl VARCHAR(50)
);

-- Création de la table Reservation
CREATE TABLE Reservation (
                             RefRe INT PRIMARY KEY,
                             ChambreNum INT,
                             DateD DATE,
                             DateF DATE,
                             FOREIGN KEY (ChambreNum) REFERENCES Chambre(NumCh)
);

-- Création de la table Passe
CREATE TABLE Passe (
                       ClientCode INT,
                       ReservationRef INT,
                       Type VARCHAR(255),
                       FOREIGN KEY (ClientCode) REFERENCES Client(CodeCl),
                       FOREIGN KEY (ReservationRef) REFERENCES Reservation(RefRe),
                       PRIMARY KEY (ClientCode, ReservationRef)
);

-- Création de la table Demande
CREATE TABLE Demande (
                         ClientCode INT,
                         ServiceId INT,
                         FOREIGN KEY (ClientCode) REFERENCES Client(CodeCl),
                         FOREIGN KEY (ServiceId) REFERENCES Service(IdS),
                         PRIMARY KEY (ClientCode, ServiceId)
);

-- Création de la table Facture
CREATE TABLE Facture (
                         CodeFact INT PRIMARY KEY,
                         LibFact VARCHAR(255)
);

-- Création de la table Paie
CREATE TABLE Paie (
                      ClientCode INT,
                      ServiceId INT,
                      FactureCode INT,
                      Montant DECIMAL(10, 2),
                      FOREIGN KEY (ClientCode) REFERENCES Client(CodeCl),
                      FOREIGN KEY (ServiceId) REFERENCES Service(IdS),
                      FOREIGN KEY (FactureCode) REFERENCES Facture(CodeFact),
                      PRIMARY KEY (ClientCode, ServiceId, FactureCode)
);
