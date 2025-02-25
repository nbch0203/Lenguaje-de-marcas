window.onload = function (){
    operacionsuma =document.getElementById("botonsuma");
    operacionsuma.addEventListener('click',suma);

    operacionresta=document.getElementById("botonresta");
    operacionresta.addEventListener('click',resta);

    operacionmutiplicacion=document.getElementById("botonmultiplicacion");
    operacionmutiplicacion.addEventListener('click',multiplicacion);

    operaciondivision=document.getElementById("botondivision");
    operaciondivision.addEventListener('click',division);

    operacionpotencia=document.getElementById("botonpotencia");
    operacionpotencia.addEventListener('click',potencia);
}

function suma(){
    var num1=parseFloat(document.getElementById("numero1").value);
    var num2=parseFloat(document.getElementById("numero2").value);
    var resultado=num1 +num2;
    document.getElementById("resultado").innerHTML=resultado;
}
function resta(){
    var num1=parseFloat(document.getElementById("numero1").value);
    var num2=parseFloat(document.getElementById("numero2").value);
    var resultado=num1 -num2;
    document.getElementById("resultado").innerHTML=resultado;
}
function multiplicacion(){
    var num1=parseFloat(document.getElementById("numero1").value);
    var num2=parseFloat(document.getElementById("numero2").value);
    var resultado=num1 * num2;
    document.getElementById("resultado").innerHTML=resultado;
}
function division(){
    var num1=parseFloat(document.getElementById("numero1").value);
    var num2=parseFloat(document.getElementById("numero2").value);
    var resultado=num1 / num2;
    document.getElementById("resultado").innerHTML=resultado;
}
function potencia(){
    var num1=parseFloat(document.getElementById("numero1").value);
    var num2=parseFloat(document.getElementById("numero2").value);
    var resultado=Math.pow(num1,num2);
    document.getElementById("resultado").innerHTML=resultado;
}


