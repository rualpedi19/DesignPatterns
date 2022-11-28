class codigoPostal {

    int cpPrimario;
    int cpSecundario;

    
codigoPostal(int valor1, int valor2) {

    int validationcpPrimario;
    int validationcpSecundario;
    
    validationcpPrimario   = 0;
    validationcpSecundario = 0;	
    
    if (valor1>=1000 && valor1<=9999) 
        validationcpPrimario += 1;
    
    if (valor2>=100 && valor2<=999) 
        validationcpSecundario += 1;
    
    if (validationcpPrimario == 1 && validationcpSecundario == 1) {
    
        cpPrimario = valor1;
        cpSecundario = valor2;
        
    }	else {
        
        System.out.println("The inserted values are not between standard regulations");
        System.out.println("The regulations are as following:");
        System.out.println("The cpPrimario should be between 1000 and 9999. Your inserted value was:" + valor1 +".");
        System.out.println("The cpSecundario should be between 100 and 999 Your inserted value was:" + valor2 +".");
        
    }
}
}