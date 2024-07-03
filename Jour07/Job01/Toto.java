class Toto{
    int toto = 0;
    Toto(){
        toto = toto + 1;

    }
    public static void main(String[] args) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto vaut : " + toto);
    }
}


// L'interpreteur revoie une erreure car on ne peut pas acceder a la variable car non-static methodes ne peuvent pas acceder a des variables statics