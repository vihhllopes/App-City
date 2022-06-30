# App-City
Desafio Rdmapps

 <h2>O que aplicativo possue?</h2>

<p>• Logo </p>
<p>• Tela Splash</p>
<p>• Tela Inicial</p>
<p>• Tela Cadastro</p>
<p>• Tela Termos de Uso</p>
<p>• Tela de Lista de Cidades</p>
<p>• Tela de Detalhes</p>


 <h2> Como Foi Feito? </h2>
 
 <p>👉 A tela Splash foi feita utilizando o "TimeTask"</p>
 <p>👉 O Intent foi utilizado para fazer a navegação entre as telas atraves do botão.</p>
 <p>👉 No FormCadastro (Tela de Cadastro) ele confere se cada campo esta preenchido e se a senha possue mais de 5 caracteres, caso o campo não esteja preenchido e a senha tenha menos que 6 caracteres, vai ser mostrado uma mensagem de "erro", caso esteja tudo certo o usuario podera navegar atraves do botão para a tela de termos de uso.</p>
 <p>👉 No TermosUso (Tela termos de uso) o usuario so pode ir para a Tela de Listas se ele marcar no checkbox que aceitou os temos, caso ele não marque e aperte no botão irá aparecer uma imagem de erro. </p>
 <p>👉 Tela de Lista e Tela de Detalhes foram feitas juntas para ocorrer a troca de informações. Foi utilizado o RecyclerView e o Dialog para formar as listas e mostrar o detalhe de cada cidade na tela de detalhes, criei 2 classes (Model e Adapter) para que ao clicasse no botão da cidade em especifica, aparecesse o detalhes apenas daquela cidade. Foram tambem criados os arquivos "row.xml" e "detalhes_dialog.xml" na pasta LAYOUT, a Row.xml é design da tela de Listas
 e a detalhes_dialog é o design da tela de Detalhes </p>
 
<h2> Tecnologias </h3>
<div>
<img align="center" alt="Vic-Js" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-plain.svg">
  <img align="center" alt="Vic-Ts" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/androidstudio/androidstudio-plain.svg">

</div>

<h2> Imagens do Aplicativo </h2>
https://www.figma.com/file/TWOCooXGpk7ygJfn73bPTn/Aplicativo-City?node-id=0%3A1

obs: o emulador que usei foi o meu proprio celular, então as imagens foram prints.
