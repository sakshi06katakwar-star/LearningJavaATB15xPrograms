package Ex_23_HTML;

public class Lab110_Xpath { }

//<!DOCTYPE html>
//<html>
//HTML starting tag

//<head>
//<title>Page Title</title>
//</head>

//<body>
//for this body we have 2 children h1 and p and h1 and p are siblings
//<h1>This is a Heading</h1>
//<p>This is a paragraph.</p>
//
//</body>

//</html>
//HTML ending tag

//head and body are tags here

//How to write X-path?
//1.right click and inspect
//2.xpath starts with double forward slash - //
//3.tag name - a
//4.square brackets - []
//5.in [] attribute following with ()
//6.attribute value in single quotes '' preceding with = sign
//ex.- //a[text()='Gift Cards']
//here we have given text that's why it is following with () and we can also give text() to match the element

//attributes are preceded by @ ex. type,class,name,placeholder etc
//ex. //input[@type='checkbox']
//  ex. //a[@id='logoutlink']
// ex.  //a[text()='Logout']

//immediate child is represented by / then name of child
//ex. //table[@class='navTable']/tbody/tr/...

//to get an immediate child //table[@class='navTable']/tbody/tr[position()=1]
//1 will become 2 if we want to have info of 2nd child and so on

//to give partial info contains() is used
//ex. td[contains(@class,'navItem')]

//to jump from grandparent to grand children (approximate children) 1st write the xpath for grandparent then // and
//xpath for approximate children
//ex. //table[@class='navTable']//div[@class='label']

//for going from child to immediate parent [] is used means xpath of child[immediate parent xpath]
//ex. //a[div[text()='tme-Track']] here div[text()='tme-Track'] is xpath of child which is inside a[] where a is
//anchor tag of immediate parent
//if we want to go more upwards and suppose td is an immediate parent so xpath will be td[a[div[text()='tme-Track']]]

//contains can also be used with not() ex. //input[not(contains(@id,'login'))]

//starts-with ex. //input[starts-with(@id,'login')]

//* represents matching any element or tag

//last is used to match the last child ex. //form/p[position()=last]
//also we can use last-1 and last-2 and so on

//following-sibling is used for younger sibling
//ex. //form[@id='loginform']/p[position()=1]/following-sibling::*
//at the place of star we can use any tag

//preceding-sibling gives elder sibling but position we have give last
//ex. //form[@id='loginform']/p[position()=last]/preceding-sibling::*

//ancestor can also use to travel from approximate children to parent
//ex. //input[@id='user_pass']/ancestor::form here form is grandparent for input tag

//using multiple properties -
//multiple properties can be used with and or combination
//ex. //input[contains(@id,'user')and @type='text']
//and is for perfect math or is for either or condition
//ex. //input[contains(@id,'user')and @type='text']

//> greater than and < lesser than is also used
//ex. //form/p[position()>1] this will give all the children except the 1st 1 because we want children whose
//position is greater than 1 but instead p if we write * we will get all children and tag
// ex. //form/p[position()<last] here last we will not get
//ex.  //form/p[position()>=2]
