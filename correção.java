HOTFIX ID: HF-2026-05-04-01
TÍTULO: Correção de erro no login

DESCRIÇÃO:
Corrige falha que impedia usuários de fazer login com senha válida.

CAUSA RAIZ:
Validação incorreta no backend ao comparar hash da senha.

ARQUIVOS ALTERADOS:
- authService.js
- userController.js

TIPO DE MUDANÇA:
[ ] Bug crítico
[ ] Segurança
[x] Funcionalidade quebrada

IMPACTO:
Alto – usuários não conseguiam acessar o sistema.

PASSOS PARA VALIDAR:
1. Acessar tela de login
2. Inserir credenciais válidas
3. Confirmar acesso ao sistema

TESTES REALIZADOS:
- Teste manual de login
- Teste automatizado atualizado

RESPONSÁVEL:
Seu nome

DATA:
2026-05-04

VERSÃO:
v1.0.1-hotfix