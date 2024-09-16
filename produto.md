## THYMELEAF 
-> É uma denpêndencia de templates utilizada em aplicações Java 
Spring Boot para renderizar páginas HTML dinâmicas no lado do servidoe.
Ela facilita a integração entre a lógica de negócio '(Java)',
e a apresentação '(HTML)', permitindo que você insira  dados do servidor diretamente nos templates HTML.

1. Adicionar a depêndencia no pom.xml.

2. Adicionando os templates do THYMELEAF.
-> Os templates precisam ser criados dentro da pasta resources/templates
Index.HTML
cadastro.HTML

3. Principais expressões do thymeleaf:

A.Exibição de dados
th:text="${Variavel}" ->Substitui o conteúdo ddo HTML com o valor da variável.

B.Links dinâmicos 
th:href="@"{/caminho} -> Ferar URls dinâmicas.

C.Condicionais 
th:if="${cindicao}" -> Exibe o elemento HTML apenas se a condição for verdadeira.

D. Iteração
th:each="item : ${lista}" -> Itera sobre uma coleção de dados.

## propriedades do fragments 
1. th:fragments -> é udado para definir blocos de codigos reutilizaveis em um template. Esses fragmentos podem ser cabeçalhos rodapés , menus de navegação ou qualquer outro conteudo que você queira reutilizar em varias paginas.(FICA NA TAG DA PAGINA A SER REUTILIZADA).

2. th:replace  -> substitui o conteudo do elemento atual com o conteudo do fragmento especificado. Ela é usada para herdar e incluir partes de codigo de outro template ou fragmento.(FICA NA TAG DA PAGINA DESTINO).

3. th:insert -> Inseri o conteudo do fragmento dentro do elemento no qual é aplicada,
mas não subistitui o elemento raiz. (FICA NA TAG DA PAGINA DESTINO).

4. th:include -> É semelhante ao insert , mas com uma diferença: ela inclui o conteudo do fragmento dentro do elemento e pode preservar o conteudo do elemento pai.(FICA NA TAG DA PAGINA DESTINO)