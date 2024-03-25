package Controller;

import kLn.*;
public class FatController {



    public FatController() {
        super();
    }



    public int fatorial(int num) {
        Pilha p = new Pilha();
        int resultado = 1;
        while(num > 0) {

            p.push(num);
            num--;

        }

        while(!p.isEmpty()) {

            try {
                num = p.pop();
            }
            catch(Exception e) {
                e.printStackTrace();
            }

            resultado = resultado * num;

        }

        return resultado;
    }

}
