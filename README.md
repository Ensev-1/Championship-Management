# Championship-Management
Java Program
Ky program stimulon manipulimin e nje gare te kampionatit me makina ne Formula 1. Kemi implementuar nje klase Formula1MenaxhimKampionati qe extends nderfaqen MenaxhimKmapionati ku dhe do te jene metodat kryesore qe zbatohen. Aty mbahet informacioni gjithashtu mbi numrin e shofereve dhe makinave qe bejne pjese.

    Kemi projektuar nje klase abstrakte Shoferi dhe klasen ShoferiFormula1. Ne klasen Shoferi perfshihen te dhenat e shoferit si emri, vendndodhja dhe ekipi ku ai ben pjese, ndersa ne ShoferiFormula1 perfshihen statistikat e shofereve si: sa here ka dale ne vend te 1 gjate garave te sezonit, sa here ka dal ne vend te 2, sa here ka dal ne vend te 3, sa pike totale ka dhe nr i garave qe ka marre pjese. Kemi perfshire gjithashtu metodat get dhe set per te marre informacion mbi keto detaje apo per ti ndryshuar ato ne cfardolloj momenti.

    Piket e dhena per cdo shofer ne nje gare te caktuar jane sipas skemes se meposhtme:
1:25, 2:18, 3:15, 4:12, 5:10, 6:8, 7:6, 8:4, 9:2, 10:1. Qe nje shofer te marre pike, duhet qe ai te perfundoje garen ne nje prej 10 vendeve te para.

    Ne klasen kryesore MenaxhimKampionati kemi perfshire nje menu te bazuar ne futjen e tekstit i cili i jep perdorueseve opsionet e:

1)	Krijimin e nje shoferi te ri (i cili shtohet ne kampionat). Shoferi duhet te jete ne nje skuader unike (prodhues makinash).
2)	Fshirjes se nje shoferi dhe skuadres ne te cilen shoferi ben pjese nga kampionati i Formula 1.
3)	Ndryshimin e shoferit per nje skuadres ekzistuese.
4)	Shfaqjen e statistikave te ndryshme kur zgjidhet nje shofer ekzistues.
5)	Shfaqjen e Tabeles se Shofereve te Formules 1, pra shoferet shfaqen ne baze te pikeve qe kane mbledhur ne sezonin aktual. Ne rast se dy shofere kane te njejtin numer pikesh, shfaqet me lart garuesi i cili ka dal me shpesh ne vend te 1.
6)	Shtimi i nje gare te perfunduar me date dhe pozicionet qe arriten te gjithe shoferet. Duke modifikuar automatikisht statistikat e te gjithe shofereve qe moren pjese.
7)	Ruajtjen e te gjithe informacionit te futur nga perdoruesi deri me ate moment ne file.
8)	Ne momentin qe rihapet aplikacioni, duhet te lexoje te gjithe informacionin e ruajtur ne file-t e meparshme (rifillim/rikuperim i gjendjes se meparshme te programit) dhe te vazhdoje funksionimin duke iu dhene mundesia perdoruesit te fuse informacione te reja ose te ndryshoje informacionin ekzistues.
