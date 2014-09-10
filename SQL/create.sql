--DROP TABLE IF EXISTS customer;
--DROP TABLE IF EXISTS zamowienie;
--DROP TABLE IF EXISTS lista_produktow;
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS customer (id_customer INTEGER PRIMARY KEY AUTOINCREMENT, nazwaKlienta TEXT, AdresFirmy TEXT, adresDostawy TEXT);
CREATE TABLE IF NOT EXISTS zamowienie(nr_zamowienia INTEGER PRIMARY KEY, produkty TEXT, ilosc INTEGER);
CREATE TABLE IF NOT EXISTS lista_produktow(id_produkt INTEGER PRIMARY KEY, nazwa_produktu TEXT, cena_netto INTEGER, vat INTEGER);
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO lista_produktow VALUES (NULL, 'Heban', '150', '23');
--SELECT * FROM lista_produktow;
CREATE VIEW IF NOT EXISTS brosef AS SELECT * FROM lista_produktow GROUP BY (id_produkt);
SELECT * FROM brosef;
--INSERT INTO customer VALUES (NULL, 'Bromancer', 'Blotna 25', 'Blotna');
--INSERT INTO customer VALUES (NULL, 'Agrotu', 'Aasdas', 'dfgdf');
--SELECT * FROM customer;
