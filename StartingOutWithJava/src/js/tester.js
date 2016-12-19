/**
 * Created by ronnyrosabal on 12/19/16.
 */

// VARIABLES

var name = "Ronny";
var labels = [ "Name", "Rosabal"];
var person = {
  "name" : "Christian"
};



// FUNCTIONS

function sayName( label1, label2 ){
  return label1 + " is " + this.name + " " + label2;
}

function moreName( label1, label2 ){
  return sayName.apply( this, arguments );
}

var sayPerson = sayName.bind( this, "Nombre");
var anotherPerson = sayName.bind( person, "Nombre", "Rosabal");



// CALLS

console.log( sayName.call( this, "Name", "Rosabal" ) );
console.log( sayName.apply( this, labels ) );
console.log( moreName( "Name", "Rosabal" ) );
console.log( sayPerson( "Rosabal" ) );
console.log( anotherPerson() );

