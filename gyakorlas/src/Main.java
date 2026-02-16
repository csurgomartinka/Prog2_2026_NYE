//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Add meg a hőmérsékletet: ");
    int homerseklet = scanner.nextInt();

    if(homerseklet < 0)
    {
        System.out.println("A hőmérséklet fagypont alatti");
    }
    else if(homerseklet > 30)
    {
        System.out.println("A hőmérséklet túl meleg");
    }
    else
    {
        System.out.println("A hőmérséklet átlagos");
    }


    int masodperc;

    do {
        System.out.println("Hány másodperccel a villámlás után hallottad a dörgést? ");
        masodperc = scanner.nextInt();

        if(masodperc < 0)
        {
            System.out.println("Negatív érték nem lehet!");
        }
    }
    while(masodperc < 0);

    int tavolsag = masodperc * 300;

    System.out.println("A villámlás " + tavolsag + " méterre volt tőled");


    int kor;

do {
    System.out.println("Add meg az életkorodat (1-20):");
    kor = scanner.nextInt();

    if(kor > 20 || kor < 0)
    {
        System.out.println("1 és 20 közötti számot adj meg!");
    }
}while(kor > 20 || kor < 0);


    for (int i = 0; i < kor; i++) {
        System.out.print("*");
    }
    System.out.println();

    for (int i = 0; i < kor; i++) {
        System.out.print("|");
    }
    System.out.println();

    for (int i = 0; i < kor; i++) {
        System.out.print("-");
    }


}
