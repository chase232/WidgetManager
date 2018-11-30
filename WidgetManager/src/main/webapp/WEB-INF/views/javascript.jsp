<%@ include file="/WEB-INF/layouts/include.jsp"%>

<!-- AMD, COMMON, and VANILLA JS MODULE EXAMPLE -->
<script src='<c:url value="/resources/js/myModule.js"/>'></script>

<div class="container">
	<h1>JavaScript Training</h1>
	<div id="elementId">Element ID Example</div>
	<p class="className">p1</p>
	<p class="className">p2</p>
</div>
<script>

/* 	require(['dojo/query', 'dojo/dom'], function(query, dom){
	    // retrieves only one element
	    let byDom = dom.byId('elementId');
	    let bySelector = document.querySelector('#elementId');
	    // all the elements with the class 'className'
	    let byClass = query('.className');	    
	    alert("byDom.innerHtml="+byDom.innerHTML+"\nbySelector.innerHTML="+bySelector.innerHTML + "\nbyClass="+byClass);
	}); */

/* 	require(['dojo/query', 'dojo/NodeList-traverse'], function(query){
		  // This code returns the four child divs in a dojo.NodeList:
		  query('div').children();
		  // This code returns the two divs that have the class "red" in a dojo.NodeList:
		  query('.container').children('.red');
		  // This code returns the one div with class "blue" and "first" in a dojo.NodeList:
		  query('.text').parent('.first')
		}); */

	// O'REILLY DOJO EXAMPLE
/* 	require([
		'local/app/example'
	], function (example) {
		//example.sayHello();
		example.sayGoodBye();
	}); */
	
	// VANILLA JS EXAMPLE
	//src/main.js
	//import * as myModule from './module';
	//console.log(myModule.hello);            // "hello"
</script>
