document.addEventListener('DOMContentLoaded', function() {
    const botaoEnviar = document.getElementById('botaoEnviar');
  
    botaoEnviar.addEventListener('click', function() {
      const form1 = document.getElementById('form1');
      const form2 = document.getElementById('form2');
      const form3 = document.getElementById('form3');
      const form4 = document.getElementById('form4');
  
      const formData1 = new FormData(form1);
      const formData2 = new FormData(form2);
      const formData3 = new FormData(form3);
      const formData4 = new FormData(form4);
  
      const jsonData = {
        nome: formData1.get('nome'),
        tipoProposta: formData2.get('tipoProposta'),
        estado: formData3.get('estado'),
        caixaTexto: formData4.get('caixaTexto')
      };

      fetch('https://localhost/propostas', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(jsonData)
      })
      .then(response => response.json())
      .then(data => {
        console.log(data);

        form1.reset();
        form2.reset();
        form3.reset();
        form4.reset();
      })
      .catch(error => {
        console.error('Erro:', error);
      });
    });
  });  
  