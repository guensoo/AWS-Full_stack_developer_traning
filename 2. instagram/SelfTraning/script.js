// 페이지가 로드될 때 팝업 숨기기
window.onload = function() {
  document.getElementById('tech-stack-popup').style.display = 'none';
};

// 기술스택 팝업 열기
function openTechStackPopup() {
  document.getElementById('tech-stack-popup').style.display = 'flex'; // 팝업을 보이게 설정
}

// 기술스택 팝업 닫기
function closeTechStackPopup() {
  document.getElementById('tech-stack-popup').style.display = 'none'; // 팝업을 숨기기
}

// 정보 섹션 토글 함수
function showSection(sectionId) {
  var sections = document.querySelectorAll('.info-section');
  sections.forEach(function(section) {
      section.style.display = 'none';
  });

  var section = document.getElementById(sectionId);
  section.style.display = section.style.display === 'block' ? 'none' : 'block';
}

// 페이지 로드 후 엔터키 이벤트 리스너 추가
document.addEventListener('DOMContentLoaded', () => {
  var input = document.getElementById('chatInput');
  
  // 엔터키가 눌렸을 때 메시지 전송
  input.addEventListener('keydown', function(event) {
      if (event.key === 'Enter') {
          event.preventDefault(); // 기본 엔터키 동작 (줄 바꿈) 방지
          sendMessage();
      }
  });
});

// 채팅 메시지 전송 함수
function sendMessage() {
  var input = document.getElementById('chatInput');
  var message = input.value;
  if (message.trim()) {
      // 사용자 메시지 출력
      var chatMessages = document.getElementById('chatMessages');
      var userMessage = document.createElement('div');
      userMessage.classList.add('message', 'user-message');
      userMessage.textContent = '나: ' + message;
      chatMessages.appendChild(userMessage);

      // AI 답변 출력 (타이핑 효과 적용)
      var aiMessage = document.createElement('div');
      aiMessage.classList.add('message', 'ai-message');
      chatMessages.appendChild(aiMessage);

      // 메시지 입력창 비우기
      input.value = '';
      chatMessages.scrollTop = chatMessages.scrollHeight;  // 최신 메시지로 스크롤 이동

      // AI의 답변을 타이핑 효과로 출력
      typeAIResponse(aiMessage, generateAIResponse(message));
  }
}

// AI의 답변 생성 함수
function generateAIResponse(userMessage) {
  // 간단한 예시 AI 답변 (여기서 추가적인 로직을 넣을 수 있음)
  if (userMessage.includes('안녕')) {
      return '안녕하세요! 무엇을 도와드릴까요?';
  } else if (userMessage.includes('취미')) {
      return '저는 다양한 취미를 좋아합니다! 게임, 음악 감상, 운동 등을 즐깁니다.';
  } else {
      return '저는 아직 많이 배우고 있어요. 더 많은 질문을 해 주세요!';
  }
}

// 타이핑 효과를 추가하는 함수
function typeAIResponse(aiMessageElement, responseText) {
  let i = 0;
  aiMessageElement.textContent = ''; // 초기 텍스트 비우기
  let typingInterval = setInterval(() => {
      aiMessageElement.textContent += responseText.charAt(i); // 한 글자씩 추가
      i++;
      if (i >= responseText.length) {
          clearInterval(typingInterval); // 모든 글자가 다 출력되면 인터벌 종료
          // 타이핑이 끝난 후 스크롤을 맨 아래로 내리기
          scrollToBottom();
      }
  }, 100); // 100ms마다 한 글자씩 출력 (속도를 조정할 수 있음)

  // 중간에 잠시 멈추는 효과 추가
  setTimeout(() => {
      aiMessageElement.textContent += '.';
  }, 500);  // 첫번째 마침표 추가 (0.5초 후)

  setTimeout(() => {
      aiMessageElement.textContent += '.';
  }, 1000);  // 두번째 마침표 추가 (1초 후)

  setTimeout(() => {
      aiMessageElement.textContent += '.';
  }, 1500);  // 세번째 마침표 추가 (1.5초 후)

  setTimeout(() => {
      aiMessageElement.textContent = responseText;  // 타이핑이 끝난 후 최종 답변 출력
      // 최종 답변 후 스크롤을 맨 아래로 내리기
      scrollToBottom();
  }, 2000);  // 최종 답변을 2초 후에 표시
}

// 스크롤을 맨 아래로 내리는 함수
function scrollToBottom() {
  var chatMessages = document.getElementById('chatMessages');
  chatMessages.scrollTop = chatMessages.scrollHeight;  // 스크롤을 맨 아래로 내리기
}


// 팝업 열기 함수
function openPopup(title, description) {
  document.getElementById('popup-title').innerText = title;
  document.getElementById('popup-description').innerText = description;
  document.getElementById('popup').style.display = 'flex';
}

// 팝업 닫기 함수
document.getElementById('closeBtn').addEventListener('click', function() {
  document.getElementById('popup').style.display = 'none';
});

// 팝업 외부 클릭 시 닫기
window.onclick = function(event) {
  if (event.target == document.getElementById('popup')) {
      document.getElementById('popup').style.display = 'none';
  }
};
