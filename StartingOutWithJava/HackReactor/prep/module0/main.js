/**
 * Created by Ronny Rosabal.
 * Date:      12/25/16
 * Objective: JavaScript for HackReactor module 0
 */

var arr = [
  [
    ['firstName', 'Joe'], ['lastName', 'Blow'], ['age', 42], ['role', 'clerk']
  ],
  [
    ['firstName', 'Mary'], ['lastName', 'Jenkins'], ['age', 36], ['role', 'manager']
  ]
];



function transformEmployeeData( array ){
  return array.map( function( elem ){
    return elem.reduce( function( result, next ) {
      result[next[0]] = next[1];
      return result;
    }, {} );
  });
}

console.log( transformEmployeeData( arr ) );