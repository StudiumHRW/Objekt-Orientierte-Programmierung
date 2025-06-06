a)

`Top object = new Middle(5, 6);`

`System.out.println( object.getResult() );`

==> Es wird die getResult() funktion von Middle Aufgerufen, entsprechend lautet die Ausgabe -1 (da 5 - 6 = -1)

b)

`Top object = new Bottom(5, 6);`

`System.out.println( object.getResult() );`

==> Es wird die getResult() funktion von Bottom Aufgerufen, entsprechend lautet die Ausgabe -5 (da 5 * -1 = -5)

c)

`Top object = new Top(5, 6);`

`System.out.println( object.getResult() );`

==> Es wird die getResult() funktion von Middle Aufgerufen, entsprechend lautet die Ausgabe 11 (da 5 + 6 = 11)