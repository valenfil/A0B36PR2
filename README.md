A0B36PR2
========
Semestrální práce

Simulace linky autobusové dopravy

Kolik bude dopravní podnik potřebovat autobusů na jednu linku?
Budu mít zadanou vzdálenost/rychlost jízdy autobusu z bodu A do bodu B. 
Intervaly které jsou mezi jednotlivými autobusy.
Zjistit ideální počet autobusů, aby zbytečně nestály na konečné zastávce.
Na trase budou omezení - omezená rychlost, semafory.
Autobus na cestě, auto, zastávka budou představovat jednotlivé procesy.
Každé auto/autobus bude mít v sobě informaci o jeho maximální rychlosti, přednosti v dopravě.
Zastávky budou představovány spojovými seznamy - čeká, na dobu svého odjezdu. Pokud je prázdný rovnou se zařadí na začátek.
Dále budu mít vytvořenou frontu - ve které budu ukládat jednotlivé události,
které budou následovat a budou seřazeny podle času (časy odjezdu jednotlivých autobusů, zstávky, jízda pomalým úsekem, semafory).
Tzn. Mám procesy: 
    Autobus ve forontě
    Nakládání pasažérů
    Autobus z A do B
    Autobus z B do A
    Vykládání pasažérů
    Čekání na konečné (fronta)
    

