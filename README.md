# Aplicativo de Controle de Vendas

Aplicativo Android para gerenciamento de vendas e estoque usando:
- Kotlin
- Firebase Firestore
- Firebase Auth
- MVVM Architecture
- Hilt DI

## Configuração

1. Crie um projeto no [Firebase Console](https://console.firebase.google.com/)
2. Baixe o `google-services.json` e coloque na pasta `app/`
3. Configure as regras de segurança do Firestore:

```rules
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    match /{document=**} {
      allow read, write: if request.auth != null;
    }
  }
}
