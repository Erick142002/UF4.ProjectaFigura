package UF4.HerenciaJerarquica;

import UF4.HerenciaJerarquica.Animal;
import UF4.HerenciaMultinivell.Arona;

class cat extends Dog {
    public void meow() {System.out.println("meow");
    }


    public static void main(String args[]) {
        cat obj= new cat();
        obj.meow();
        obj.bark();
    }


}
