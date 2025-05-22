document.addEventListener('DOMContentLoaded', function() {
    let idCheck = document.querySelector('#id_input');
    let idValue = document.querySelector('#id_alert');

    let pwCheck = document.querySelector('#pw_input');
    let pwValue = document.querySelector('#pw_alert');

    let nameCheck = document.querySelector('#name_input');
    let nameValue = document.querySelector('#name_alert');

    let emailCheck = document.querySelector('#email_input');
    let eamilValue = document.querySelector('#email_alert');

    let submitButton = document.querySelector('#submit');

    idCheck.addEventListener('click', function() {
        if(idCheck > 4 && idCheck < 20) {
            idValue.style.color = 'green';
        }
        else {
            idValue.style.color = 'red';
        }
        
    });

    pwCheck.addEventListener('click', function() {
        if(pwCheck > 8 && pwCheck < 20) {
            pwValue.style.color = 'green';
        }
        else {
            pwValue.style.color = 'red';
        }
        
    });









    nameCheck.addEventListener('click', function() {
        nameValue.style.display = 'block';
    });

    emailCheck.addEventListener('click', function() {
        if(emailCheck > 8 && pwCheck < 20) {
            emailValue.style.color = 'green';
        }
    });


    submitButton.addEventListener('click', function() {
    
    let con = confirm('가입하시겠습니까?');
  
      if(con) {
        alert('가입이 완료되었습니다.');
       } 
       else {
        alert('가입이 취소되었습니다.');
      }
    });
  });