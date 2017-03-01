/**
 * Created by Ronny Rosabal.
 * Date:      2/27/17
 * Objective:
 */
"use strict";

function Rectangle( width, height ) {
  this.width = width;
  this.height = height;
}

Rectangle.prototype.getArea = function() {
  return this.width * this.height;
};

Rectangle.prototype.toString = function() {
  return "Rectangle: " + this.width + " x " + this.height;
};

function Square( sideLength ) {
  this.width = sideLength;
  this.height = sideLength;
}

//Square.prototype = new Rectangle();
//Square.prototype.constructor = Square;
Square.prototype = Object.create( Rectangle.prototype, {
  constructor : {
    configurable : true,
    writeable : true,
    enumerable : true,
    value : Square
  }
});


Square.prototype.toString = function() {
  return "Square: " + this.width + " x " + this.height;
};

var rect = new Rectangle( 4, 5 );
var square = new Square( 5 );

console.log( "Rect:", rect.toString() );
console.log( "Square:", square.toString() );
console.log( "Square area: " + square.getArea() );