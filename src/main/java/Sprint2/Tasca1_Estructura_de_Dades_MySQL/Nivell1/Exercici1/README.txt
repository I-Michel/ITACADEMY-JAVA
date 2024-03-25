ENUNCIAT DE L'EXERCICI

SPRINT 2: BASES DE DADES
Tasca 1: Estructura de Dades - MySQL
Nivell 1, Exercici 1

**********************************************************************************************
Crea a github.com un repositori anomenat mysql-estructura que contingui la solució. Per a cada
base de dades ha de pujar-se el següent:

- Model Relacional amb el disseny de la base de dades. Si ho desitges, pots utilitzar draw.io,
dbdiagram.io, Mysql Workbench o qualsevol altra eina que et permeti dibuixar l'estructura i
exportar-la en format png o jpg (per a pujar-la al repositori). Et recomanem especialment
genmymodel.com.

- Script .sql de creació i càrrega de la base de dades.
**********************************************************************************************

Una òptica, anomenada “Cul d'Ampolla”, vol informatitzar la gestió dels clients/es i vendes d'ulleres.

En primer lloc, l'òptica vol saber quin és el proveïdor de cadascuna de les ulleres. En concret vol
saber de cada proveïdor:

- El nom
- L'adreça (carrer, número, pis, porta, ciutat, codi postal i país)
- Telèfon
- Fax
- NIF

La política de compres de l'òptica es basa que les ulleres d'una marca es compraran a un únic proveïdor
(així en podrà treure més bons preus), però poden comprar ulleres de diverses marques a un proveïdor.
De les ulleres vol saber:
- La marca.
- La graduació de cadascun dels vidres.
- El tipus de muntura (flotant, pasta o metàl·lica).
- El color de la muntura.
- El color de cada vidre.
- El preu.

Dels clients/es vol emmagatzemar:
- El nom.
- L'adreça postal.
- El telèfon.
- El correu electrònic.
- La data de registre.
- Quan arriba un/a client/a nou, emmagatzemar el/la client/a que li ha recomanat l'establiment (sempre
que algú li hagi recomanat).
- El nostre sistema haurà d’indicar qui ha sigut l’empleat/da que ha venut cada ullera.