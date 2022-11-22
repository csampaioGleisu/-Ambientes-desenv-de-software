function GerarFibonacci(number){
    var fibonacci = [];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    for (var i = 2; i < number; i++) {
      fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
    }
    return fibonacci;
    }
    var n = GerarFibonacci(12);
    //Assim quanto maior o número colocado maior a quantidade de interações.
    console.log(n);