package Controller;

import android.widget.EditText;

public class Controller {
    public String verificaMaiorMenor(EditText a, EditText b){
        float n1 = Float.parseFloat(a.getText().toString());
        float n2 = Float.parseFloat(b.getText().toString());
        String res;
        if(n1 > n2){
            res = "O número " + n1 + " é maior que " + n2;
        } else if (n1 < n2) {
            res = "O número " + n2 + " é maior que " + n1;
        } else{
            res = "Os números são iguais";
        }
        return res;
    }

    public String calcular(EditText a, EditText b){
        float n1 = Float.parseFloat(a.getText().toString());
        float n2 = Float.parseFloat(b.getText().toString());
        String res;
        if(n1 % 2 != 0 && n2 % 2 != 0){
            res = "A soma dos dois números é: " + (n1 + n2);
        } else{
            res = "Um dos números não é ímpar";
        }
        return res;
    }
}
