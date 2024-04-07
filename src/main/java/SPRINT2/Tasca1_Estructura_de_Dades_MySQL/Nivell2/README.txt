ENUNCIAT DE L'EXERCICI

SPRINT 2: BASES DE DADES
Tasca 1: Estructura de Dades - MySQL
Nivell 2

**********************************************************************************************
Crea a github.com un repositori anomenat mysql-estructura que contingui la solució. Per a cada
base de dades ha de pujar-se el següent:

- Model Relacional amb el disseny de la base de dades. Si ho desitges, pots utilitzar draw.io,
dbdiagram.io, Mysql Workbench o qualsevol altra eina que et permeti dibuixar l'estructura i
exportar-la en format png o jpg (per a pujar-la al repositori). Et recomanem especialment
genmymodel.com.

- Script .sql de creació i càrrega de la base de dades.
**********************************************************************************************

Tractarem de fer un model senzill de com seria la base de dades per a una versió reduïda de YouTube.

* De cada usuari/ària guardem un identificador únic:
    - Email.
    - Password.
    - Nom d'usuari/ària.
    - Data de naixement.
    - Sexe.
    - País.
    - Codi postal.

* Un usuari/ària publica vídeos. De cada vídeo guardem un identificador únic:
    - Un títol.
    - Una descripció.
    - Una grandària.
    - El nom de l'arxiu de vídeo.
    - Durada del vídeo.
    - Un thumbnail.
    - El nombre de reproduccions.
    - El número de likes.
    - El número de dislikes.

* Un vídeo pot tenir tres estats diferents: públic, ocult i privat. Un vídeo pot tenir moltes
etiquetes. Una etiqueta s'identifica per un identificador únic i un nom d'etiqueta. Interessa
guardar qui és l'usuari/ària que publica el vídeo i en quina data/hora el fa.

* Un usuari/ària pot crear un canal. Un canal té un identificador únic:
    - Un nom.
    - Una descripció.
    - Una data de creació.

* Un usuari/ària es pot subscriure als canals d'altres usuaris/es. Un usuari/ària pot donar-li un
like o un dislike a un vídeo una única vegada. Caldrà portar un registre dels usuaris/es que li han
donat like i dislike a un determinat vídeo i en quina data/hora ho van fer.

* Un usuari/ària pot crear playlists amb els vídeos que li agraden. Cada playlist té un identificador únic:
    - Un nom.
    - Una data de creació.
    - Un estat que indica que pot ser pública o privada.

* Un usuari/ària pot escriure comentaris en un vídeo determinat. Cada comentari està identificat per
un identificador únic:
    - El text del comentari.
    - La data/hora en la qual es va realitzar.

* Un usuari/ària pot marcar un comentari com m'agrada o no m'agrada. Caldrà portar un registre dels
usuaris/es que han marcat un comentari com m'agrada/no m'agrada, i en quina data/hora ho van fer.