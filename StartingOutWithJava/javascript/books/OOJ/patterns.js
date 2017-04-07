/**
 * Created by Ronny Rosabal.
 * Date:      4/3/17
 * Objective:
 */
"use strict";

var person = ( function() {
  var age = 0;
  return {
    "name" : "Christian",
    "getAge" : function() {
      return age;
    }
  }
}() );