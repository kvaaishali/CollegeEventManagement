function addEvent(){

let eventName = document.getElementById("eventName").value;

if(eventName == ""){
alert("Please enter event name");
return;
}

let li = document.createElement("li");
li.textContent = eventName;

document.getElementById("eventList").appendChild(li);

document.getElementById("eventName").value = "";

}