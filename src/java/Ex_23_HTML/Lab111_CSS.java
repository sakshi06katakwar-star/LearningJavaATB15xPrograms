package Ex_23_HTML;

public class Lab111_CSS { }
// // and @ is not used ex. input[id='user_login']

//* is used at the place of contains ex. input[id* = 'user']

//ex. //input[starts-with (@id.'user')] in css starts-with replaces with ^
//   input[id^='user']

//$ denotes ends with ex. input[id$ = 'login']

//ID - ex. input[id='user_login'] at the place of id= we can use # input#user_login or #user_login

//Class - input[class='input'] at the place of class= we can use . input.input or.input

//Using Siblings -
//Immediate Child - in xpath / was used ex. //form/p but in css > is used ex. form>p or form>*

//Approximate child - in xpath // was used ex. //form//input in css space is used ex. form input

//In xpath going from Approximate child to grandparent -
// //input/ancestor::form and

//In xpath going from immediate child to parent -
// label[input]

//Immediate parent and grandparent we don't have travelling rule in css

//Younger sibling -
//in xpath we used following-sibling:: ex. //form/p[1]/following-sibling::p[last()]
//in css :nth-child is used ex. form>p:nth-child(2)
// but id p is not 2nd child its <a></a> is 2nd child then :nth-of-type is uesd
//ex. form>p:nth-of-type(2)

//In css there is not preceding sibling rules

//to go to immediate younger sibling in css + is used ex. form>p:nth-of-type(1)+a+p+p

//Tilt ~ is used to travel across all the younger sibling ex. form>p:nth-of-type(1)~p

//AND - both values should match
//ex. p[class='forgetmenot'][class='submit']

//OR - in between ,
//ex. p[class='forgetmenot'],[class='submit']

//1st child - form>p:first-child

//last child - form>p:last-child

//:checked is used to check whether any check box is checked or not
// ex. input[type='checkbox']:checked




