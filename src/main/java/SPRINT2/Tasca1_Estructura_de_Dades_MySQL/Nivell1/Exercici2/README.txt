ENUNCIAT DE L'EXERCICI

SPRINT 2: BASES DE DADES
Tasca 1: Estructura de Dades - MySQL
Nivell 1, Exercici 2

**********************************************************************************************
Crea a github.com un repositori anomenat mysql-estructura que contingui la solució. Per a cada
base de dades ha de pujar-se el següent:

- Model Relacional amb el disseny de la base de dades. Si ho desitges, pots utilitzar draw.io,
dbdiagram.io, Mysql Workbench o qualsevol altra eina que et permeti dibuixar l'estructura i
exportar-la en format png o jpg (per a pujar-la al repositori). Et recomanem especialment
genmymodel.com.

- Script .sql de creació i càrrega de la base de dades.
**********************************************************************************************

T’han contractat per a dissenyar una web que permeti fer comandes de menjar a domicili per Internet.

Tingues en compte les següents indicacions per a modelar com seria la base de dades del projecte:

* Per a cada client/a emmagatzemem un identificador únic:
    - Nom.
    - Cognoms.
    - Adreça.
    - Codi postal.
    - Localitat.
    - Província.
    - Número de telèfon.
    - Les dades de localitat i província estaran emmagatzemats en taules separades. Sabem que una
    localitat pertany a una única província, i que una província pot tenir moltes localitats. Per a
    cada localitat emmagatzemem un identificador únic i un nom. Per a cada província emmagatzemem un
    identificador únic i un nom.

* Una persona pot realitzar moltes comandes, però una única comanda només pot ser realitzat per una
  única persona. De cada comanda s'emmagatzema un identificador únic:
    - Data/hora.
    - Si la comanda és per a repartiment a domicili o per a recollir en botiga.
    - La quantitat de productes que s'han seleccionat de cada tipus.
    - El preu total.

*** Una comanda pot constar d'un o diversos productes. ***

* Els productes poden ser pizzes, hamburgueses i begudes. De cada producte s'emmagatzema un identificador únic:
    - Nom.
    - Descripció.
    - Imatge.
    - Preu.

*** En el cas de les pizzes existeixen diverses categories que poden anar canviant de nom al llarg de l'any.
    Una pizza només pot estar dins d'una categoria, però una categoria pot tenir moltes pizzes. ***

* De cada categoria s'emmagatzema un identificador únic i un nom. Una comanda és gestionada per una única botiga
  i una botiga pot gestionar moltes comandes. De cada botiga s'emmagatzema un identificador únic:
    - Adreça.
    - Codi postal.
    - Localitat.
    - Província.

* En una botiga poden treballar molts empleats/des i un empleat/da només pot treballar en una botiga. De cada
  empleat/da, s'emmagatzema un identificador únic:
    - Nom.
    - Cognoms.
    - NIF.
    - Telèfon.
    - Si treballa com a cuiner/a o repartidor/a. Per a les comandes de repartiment a domicili interessa guardar
    qui és el repartidor/a que fa el lliurament de la comanda i la data/hora del moment del lliurament.