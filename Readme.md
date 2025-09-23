#Aprendendo GIT e GITHUB

##GIT
Git-> Sistema de controle de versao e rastreamento, ajuda a melhorar e controlar as versoes do codigo,
sabendo oque foi alterado e com possibilidade de voltar para a versao sem erro.
Apos instalar git temos que configurar com os seguintes comandos:
git config --global user.name 'teu nome' -> vai configurar o nome do usuario
git config --global user.email 'teu email' -> vai configurar o email do usuario

###Repo ou repositorio
E um armazenamento virtual onde sao guardados todos arquivos de um projecto e o seu historico de alteracoes,
e como se fosse um directorio "pasta" que armazena tadas versoes do codigo.
Para criar um repositorio usamos o seguinte comando:
git init -> Vai criar um reposiorio local.
para configurar o nome da ramificacao primaria(branch) usamos o seguinte comando:
git config -- global init.defaultBranch + nome da tua ramificacao
Para verificar em qual branch estou e quais arquivos ja estao a ser rastreados e quais nao estao usamos o seguinte comando:
git status -> vai retornar o relatorio do que mudou no projecto antes de salvar e fazer o commit e o push.
Para adicionar um ficheiro usamos o seguinte comando:
git add + nome do ficheiro
git add ./ -> adiciona todos ficheiros criados, modificados e deletados
Depois de adicionar um ficheiro temos que fazer um commit e cada commit tem o seu id "hash", para fazer um comit usamo o seguinte comando:
git commit -m 'Tua mensagem'2    
Para ver o historico de todos commmit usamos o seguinte comando:
git log -> vai retornar o historico
Imagine que voce esta a trabalhar em desenvolvimento de uma aplicacao e voce faz o primeiro  commit enquanto tudo esta a funcionar bem,
porem mais tarde voce adiciona um funcao e a aplicao para de funcionar devido a um bug, para voltar no tempo  para a versao que esta a 
funcionar sem o codigo  que gerou o bug usamos o seguinte comando:
git checkout +commit Id/hash

#Github
Github e uma plataforma de nuvem que permite armazenar repositorios git e colaborar com outros,  para enviar projectos locais para o
github precisamos vincular o repositorio local com um remoto, para vincular usamo o seguinte comand.
git remote add origin +url do repositorio remoto
para mandar projecto local para o remoto usamos o seguinte comando:
git push -u origin main -> vai mandar o repositorio local para o remoto, origin refere-se ao url e main e o nome do branch



