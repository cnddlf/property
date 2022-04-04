function count(type)  {
    // 결과를 표시할 element
    const resultElement = document.getElementById('result1')
    // 현재 화면에 표시된 값
    let number = resultElement.innerText;
    // 더하기/빼기
    if(type === 'plus1') {
      number = parseInt(number) + 1;
    }else if(type === 'minus1')  {
      number = parseInt(number) - 1;
    }
    // 결과 출력
    resultElement.innerText = number;
}

function count(type)  {
    const resultElement = document.getElementById('result2')
    let number = resultElement.innerText;
    if(type === 'plus2') {
      number = parseInt(number) + 1;
    }else if(type === 'minus2')  {
      number = parseInt(number) - 1;
    }
    resultElement.innerText = number;
}