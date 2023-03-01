<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<style>
.cardList {
	display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap; 
}

.card.img {
	height: 100px;
	width: 100px;
}

p {
    font-size: 24px;
    text-align: center;
  }
header {
    color: blue;
    font-size: 36px;
    text-align: center;
    padding: 20px;
    grid-area: "header";
    font: arial;
  }
l1 {
    font-size: 24px;
    text-align: center;
    justify-content: right;
  }
button {
    border: none;
    color: white;
    padding: 15px 33px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    background-color: blue;
  }
  
.center {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 50px;
  }
.box {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-right: 209px;
    height: 50px;
  }
  
  .box select {
    background-color: blue;
    color: white;
    padding: 12px;
    width: 236px;
    border: none;
    font-size: 20px;
    outline: none;
  }

  .box select option {
    padding: 30px;
  }
  body {
   background: linear-gradient(-45deg, #52ee98, #3ce7e7, #23a6d5, #c3d523);
   background-size: 400% 400%;
   animation: gradient 15s ease infinite;
   height: 100vh;

  }

  .nine h1 {
    text-align:center; font-size:50px; text-transform:uppercase; color:#222; letter-spacing:1px;
    font-family:"Playfair Display", serif; font-weight:400;
  }
  .nine h1 span {
    margin-top: 5px;
      font-size:15px; color: blue; word-spacing:1px; font-weight:normal; letter-spacing:2px;
      text-transform: uppercase; font-family:"Raleway", sans-serif; font-weight:500;
  
      display: grid;
      grid-template-columns: 1fr max-content 1fr;
      grid-template-rows: 27px 0;
      grid-gap: 20px;
      align-items: center;
  }
  
  .nine h1 span:after,.nine h1 span:before {
      content: " ";
      display: block;
      border-bottom: 1px solid #ccc;
      border-top: 1px solid #ccc;
      height: 5px;
    background-color:#f8f8f8;
  }
  
   .nine h2 {
    text-align:center; font-size:50px; text-transform:uppercase; color:#222; letter-spacing:1px;
    font-family:"Playfair Display", serif; font-weight:400;
  }
  .nine h2 span {
    margin-top: 5px;
      font-size:24px; color: blue; word-spacing:1px; font-weight:normal; letter-spacing:2px;
      text-transform: uppercase; font-family:"Raleway", sans-serif; font-weight:500;
  
      display: grid;
      grid-template-columns: 1fr max-content 1fr;
      grid-template-rows: 27px 0;
      grid-gap: 20px;
      align-items: center;
  }
  
  .nine h2 span:after,.nine h2 span:before {
      content: " ";
      display: block;
      border-bottom: 1px solid #ccc;
      border-top: 1px solid #ccc;
      height: 5px;
    background-color:#f8f8f8;
  }
  
  
  .whitepaper {
    background-color: white;
    width: 94%;
    margin-left:3%;
    height: 95vh;
    box-shadow:3px 3px 5px 2px rgba(0,0,0,.8);
  }
  
    
    @keyframes gradient {
   0% {
   background-position: 0% 50%;
   }
   
   50% {
   background-position: 100% 50%;
   }
   
   100% {
    background-position: 0% 50%;
    }
    }
    
</style>
<head>

</head>
  
 <div class="d-flex flex-column justify-content-center w-100 h-100">
  <div class="whitepaper">
 
    
  <header>
    <div class="nine">
      <h1>Pokemon Pack Opening Simulator<span>Below you can choose your pack and then click the button to open!</span></h1>
    </div>
  </header>

  <body> 
  
  <c:url var="formAction" value="/pack"/>
  <form method = GET action="${formAction}">
    <div class="box">
       <label for="packs"><l1>Packs you can open:&nbsp;&nbsp;</l1></label>
        <select id="packs" class="form-control" name = "packs">
          <option value="Silver Tempest">Silver Tempest</option>
          <option value="Lost Origin">Lost Origin</option>
          <option value="Astral Radiance">Astral Radiance</option>
        </select>
     
    </div>
    
    <div class = "center">
    	<label for="quantity">Quantity (Max 36):</label>
		<input type = "number" id="quantity" name="quantity" min="1" max="36">
	</div>
     
	 <div class = "center">
        <button type="submit" class = "btn btn-primary">
            Click here to open pack!
        </button>
     </div>
    </form>
    
    
    
      <div class = "nine">
    <h2><span> Opening ${packName}</span></h2>
     </div>
     
     <div class = "cardList">
     <c:forEach items="${cardList}" var="card">
     	
     	<div class = "card">	
	 		<p>&nbsp;&nbsp;${card.getName()}&nbsp;&nbsp;</p>
	 		<p>&nbsp;&nbsp;${card.getImage()}&nbsp;&nbsp;</p>
	 		<c:url var="imgSrc" value="/images/pokemon.jpg" /> 
			<img src="${imgSrc}"/>
	 	</div>		
	 	
	 </c:forEach>
	 </div>
   
   </body>
   </div>
  </div>
</html>
