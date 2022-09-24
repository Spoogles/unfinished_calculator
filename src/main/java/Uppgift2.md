
1: OperationsTest, Main, handleOps och Operations är alla klasser som förekommer i koden.
   All kod i handleOps och Operations är metoder t.ex handleAddition().
   Double, boolean och int är de primitiva datatyperna som förekommer i koden.
   Scannern är det enda objektet som förekommer i koden.

2: Innan jag öppnar koden så har jag en 3 stegs plan. 
   Steg 1: Få koden att köra från start till slut.
   Steg 2: Få koden att göra det den ska.
   Steg 3: Finslipa kod för effektivitet/lättläslighet.

   Det första jag gjorde när jag öppnade programmet var att köra den och se vad för errormeddelande jag får.
   Detta ger mig en startpunkt för vart jag ska börja tackla problemen.
   
   Jag läser därefter koden och försöker lista ut vad den försöker åstadkomma, i det här fallet låg problemet 
   med metoden selectInput. Den försökte göra en mix av att skriva ut text så användaren vet vad den ska välja,
   ha en lista med godtagbara svar som sedan skickas till switchen, och till sist försökte den ha en kod som avbryter
   programmet om du skickar in ett svar som inte är på listan.

   Jag tog bort allt för jag ansåg att koden var onödig eller kunde göras på ett mer effektivt sätt.
   Till att börja med så behöver en switch inte en lista med acceptabla siffror då switchen i fråga redan säger vilka 
   siffror som är acceptabla med hjälp av case. Likaså skickar du in något i switchen som inte är med i case så 
   skickas det till default så du behöver inte kod för att avbryta heller. På det så finns även tanken om du någonsin
   vill lägga till fler cases i efterhand så hade du behövt lägga till kod i både switchen OCH selectInput metoden.
   
   Så nu kör programmet, nästa steg är att kolla på metoden swichen kallade på.
   Både handleDivision och Division fungerade ganska bra, jag ändrade int till double på input delen så du kan 
   göra mer specifika divisioner, likaså tog jag bort den initierade variabeln inne i division för den behövs tekniskt
   sett inte. Perfekt, de här två kan jag använda som en mall till resterande funktioner som ska läggas till.
   
   Med hjälp av dessa metoder som mall så fyllde jag ut switchen och Operations klassen med det som behövdes för att
   få kalkylatorn att fungera. Så nu kör den från start till slut OCH den gör det den ska. Dags för finslip.

   Det första jag gjorde var att tackla tanken "Vad gör programmet om jag skickar en bokstav istället för en siffra?".
   Jag översatte en kod jag skrivit tidigare i c# förra året till java. 
   
   Tanken är att du skapar en while loop som bara bryts om scannern scannar en siffra, annars ber den dig skriva igen.
   
   Metoden anropas till både switchen och kalkylatorns metoder, vilket blir ett problem då switchen behöver en int och 
   kalkylatorn använder sig av doubles. Lättaste lösningen var att låta scannern leta efter 
   double och sen göra en cast till int bara när switchen används.

   Det var två saker med programmet jag störde mig på, ena var att när du gjort en beräkning så skrev den ut svaret
   och hoppade direkt till switch loopen och alla deras utskrifter, så du behövde scrolla upp för att se vad 
   svaret på din beräkning var. Min lösning var att igen översätta från min c# erfarenhet.
   
   console.readKey() är en metod i c# vars enda funktion är att vänta på ett knapptryck, vilket som helst, innan det går vidare.
   Metoden jag skapade är lite sämre då readKey väntar på vilket knapptryck som helst, den här metoden behöver att du trycker enter.

   Nästa sak jag störde mig på var att då allting loopar så blir det en jävlans massa text i terminalen.
   C# har console.Clear(), java har System.out.println("\033[H\033[2J"), och det var här jag lärde mig att intelliJ 
   terminalen är inte en riktig terminal så jag kunde tyvärr inte få det att fungera, men användarupplevelsen hade varit bättre
   om vi hade haft en riktig terminal.

   Det sista jag gjorde var att göra koden lättare att läsa. Skapade en metod för switchen, då en vän sa "Du vill ha så lite som möjligt i main".
   Likaså gjorde jag en separat klass för alla hanteringar av matematiska operationer.

   Har man bra förståelse för kod kan man säkert läsa först och se vart buggarna/problemen är någonstans, alternativt så 
   är intelliJ väldigt duktig på att visa och markera vart potentiella problem ligger.
   Jag känner dock att min "Kör och se vart programmet får ont" strategi är simplast då den inte kräver mycket hjärnkraft
   från dig som kodare. Jag observerade att en av de vanligaste problemen folk hade var att lista ut "vart ska jag börja?"
   vilket min strategi gör åt dig.

3: Unit tester är fantastiskt för att testa att specifika delar av din kod fungerar som det ska.
   Då unit tester ger ett specifikt input och förväntar sig ett specifikt svar, t.ex vid addition ger testet 2 och 3, så förväntar den sig att 
   return satsen kommer vara 5.
   Det kan däremot vara nyttigt att ha flera test för samma metod. 
   Om vi använder kalkylatorn som exempel, 2+2, 2*2 och 2^2 är alla 4. 
   Låt oss säga att du klantade dig och din additions metod råkar istället använda multiplikation istället.
   Om unit tester lägger in 2 och 2 som input och förväntar sig 4 tillbaka som svar så kommer den inte märka av felet.
   Lägger du däremot in ett till test som har t.ex input 3 och 5 och förväntar sig 8, men den får tilbaka 15 så känner den av att det är ett problem



