class NumeroContacto {

    String numeroTelemovel;

    NumeroContacto (String numeroTele) {
    
    // int size = numeroTele.length(); 

    if(numeroTele.length() == 9) {
    numeroTelemovel = numeroTele;
    }
    
    else {
        System.out.println("Numero de caracteres invalido");
    }

    }

}