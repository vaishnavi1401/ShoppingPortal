<!DOCTYPE html>

<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
div {border: 3px solid #f1f1f1;width: 300px;
  height: 400px;padding: 12px 20px;
  position: absolute;
    top:30%;
    left: 40%;
    margin-top: -50px;
    margin-left: -50px;
   }

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #aa00ff
;
  box-sizing: border-box;
}

button {
  background-color: #aa00ff


;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}
</style>
</head>

<form action="submtitem">
    <div class="container">
  <h1>ADD Item</h1>
    <label for="itemname"><b>ITEMNAME</b></label>
    <input type="text" placeholder="Enter itemname" name="itemname" required>

    <label for="quantity"><b>QUANTITY</b></label>
    <input type="text" placeholder="Enter quantity" name="quantity" required>

    <label for="price"><b>PRICE PER ITEM</b></label>
    <input type="text" placeholder="Enter price" name="price_per_item" required>
 <button class="registerbtn">Submit</button>
  </div>
 </form>
