ENUNCIAT DE L'EXERCICI

SPRINT 2: BASES DE DADES
Tasca 3: Estructura de Dades - MongoDB
Nivell 2

*****************************************************************************************************
Envia la URL a un repositori anomenat mongoDB-estructura que contingui la solució. Per a cada base de
dades ha de pujar-se el següent:

Diagrama realitzat mitjançant les eines Draw.io o Moon Modeler i/o fitxers js/json amb les diferents
col·leccions de la vostra base de dades.
*****************************************************************************************************

T’han contractat per a dissenyar una web que permeti fer comandes de menjar a domicili per Internet.

Tingues en compte les següents indicacions per a modelar com seria la base de dades del projecte:

- Per a cada client/a emmagatzemem un identificador únic: Nom, cognoms, adreça, codi postal, localitat,
província, número de telèfon.

- Una persona pot realitzar moltes comandes, però una única comanda només pot ser realitzat per una
única persona. De cada comanda s'emmagatzema un identificador únic: Data/hora de realització, si la
comanda és per a repartiment a domicili o per a recollir en botiga, la quantitat de productes que s'han
seleccionat de cada tipus, el preu total a més d’una nota amb informació addicional.

- Una comanda pot constar d'un o diversos productes.

- Els productes poden ser pizzes, hamburgueses i begudes. De cada producte s'emmagatzema un identificador
únic: Nom, descripció, imatge, preu. En el cas de les pizzes existeixen diverses categories que poden anar
canviant de nom al llarg de l'any.

- Una comanda és gestionada per una única botiga i una botiga pot gestionar moltes comandes. De cada botiga
s'emmagatzema un identificador únic: Adreça, codi postal, localitat, província.

- En una botiga poden treballar molts empleats/des i un empleat/da només pot treballar en una botiga. De cada
empleat/da, s'emmagatzema un identificador únic: Nom, cognoms, NIF, Telèfon, si treballa com a cuiner/a o
repartidor/a. Per a les comandes de repartiment a domicili interessa guardar qui és el repartidor/a que fa el
lliurament de la comanda i la data/hora del moment del lliurament.