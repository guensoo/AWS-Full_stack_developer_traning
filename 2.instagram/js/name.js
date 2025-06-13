document.addEventListener("DOMContentLoaded",(e) => {
  let name = document.querySelector("#name");
  let edit_btn = document.querySelector("#edit");
  let editNameField = document.querySelector("#editNameField");
  let editName = document.querySelector("#edit_name");
  let submit = document.querySelector("#submit");

  edit_btn.addEventListener("click",(e) =>{
    editNameField.style.display="block";
    edit_btn.style.display="none";
  })

  submit.addEventListener("click",(e) => {
    name.value = editName.value;
    editName.value = ''
    editNameField.style.display="none";
    edit_btn.style.display="inline";
  })
})
