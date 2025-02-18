function number(numero){
	var caracter = document.insertar.pantalla.value;
	var generated = caracter + numero;
	document.insertar.pantalla.value = generated;
}

function operateAll(){
	var operacion = eval(document.insertar.pantalla.value);
	document.insertar.pantalla.value = operacion;
}

function limpiar(){
	document.insertar.pantalla.value = '';
}

function deleteLast(){
	var anterior = document.insertar.pantalla.value;
	var generated = anterior.slice(0,-1);

	document.insertar.pantalla.value = generated;
}

function parentesisAbrir(){
	document.insertar.pantalla.value += '(';
}

function parentesisCerrar(){
	document.insertar.pantalla.value += ')';
}

function simbologia(){
	document.getElementById("informacion").innerHTML = "** es igual a elevado (^)<br>Para hacer la raiz cuadrado utiliza -> **^(1/2)";
}