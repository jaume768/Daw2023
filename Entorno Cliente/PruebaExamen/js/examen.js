
var joc;

function Jugador(ma){
    this.ma = ma;
    this.pintar = function(){
        return ma;
    }
}

function Mano(num){
    this.num = num;
    this.pintar = function (){
        return `<img src="./images/hand${num}.png" alt=""></img>`
    }
}

function tipusMano(prompt){
    if(prompt === "piedra"){
        return 0;
    } else if(prompt === "papel") {
        return 5;
    } else if(prompt === "tijeras"){
        return 2;
    }
}

function Joc(){ 
    var majugador;
    var maMaquina;   
    this.jugador;
    this.maquina;
    this.init = function (){
        
        var opcions = [0,5,2]
        var prompt = pintarPrompt()
        var tipus = tipusMano(prompt);
        var random = opcions[Math.floor(Math.random() * opcions.length)];

        majugador = new Mano(tipus,prompt)
        maMaquina = new Mano(random,"")

        this.jugador = new Jugador(majugador)
        this.maquina = new Jugador(maMaquina)
    }
    this.jugar = function (){
        var numJugador = majugador.num;
        var numMaquina = maMaquina.num;

        if(numJugador === numMaquina){
            return "Empate"
        } else {
            return "no empate"
        }
    }
    this.pintar = function (){
        var valor = this.jugar()
        console.log(valor)
        var manojugador = this.jugador.pintar();
        var manoMaquina = this.maquina.pintar();
        document.querySelector("#hand1").innerHTML = manojugador.pintar()
        document.querySelector("#hand2").innerHTML = manoMaquina.pintar()
    }
}

function init(){
    this.joc = new Joc;
    joc.init()
}

function jugar(){
    joc.pintar()
}

function pintarPrompt(){
    var missatge = prompt("Elige: piedra, papel o tijeras")

    return missatge;
}

init()
jugar()