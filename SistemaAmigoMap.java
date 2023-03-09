package SistemaAmigo;

import java.util.HashMap;

public class SistemaAmigoMap {
    private HashMap<String, String> amigos;
    private HashMap<String, String> mensagens;

    public SistemaAmigoMap(){
        this.mensagens = new HashMap<>();
        this.amigos = new HashMap<>();
    }
    public void cadastraAmigo(String nomeAmigo, String emailAmigo) {
            this.amigos.put();
            this.mensagens.put()
        }

}


//import java.util.ArrayList;
//import java.util.List;
//
//    public class SistemaAmigo {
//        private List<Mensagem> mensagens;
//        private List<Amigo> amigos;
//
//        public SistemaAmigo(){
//            this.mensagens = new ArrayList<>();
//            this.amigos = new ArrayList<>();
//        }
//
//        public void cadastraAmigo(String nomeAmigo, String emailAmigo) {
//            this.amigos.add(new Amigo(nomeAmigo, emailAmigo));
//        }
//
//        public List<Mensagem> getMensagens() {
//            return mensagens;
//        }
//
//        public List<Amigo> getAmigos() {
//            return amigos;
//        }
//
//        public void cadastrarMensagens(Mensagem m) {
//            this.mensagens.add(m);
//        }
//
//        public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException{
//            Amigo amigoPesquisado = null;
//            for (Amigo a : this.amigos) {
//                if (a.getEmail().equals(emailAmigo)) {
//                    amigoPesquisado = a;
//                }
//            }
//            if(amigoPesquisado == null){throw new AmigoInexistenteException("Amigo Inexistente");}
//            return amigoPesquisado;
//        }
//
//        public String pesquisaAmigoSecreto(String emailAmigo) throws AmigoInexistenteException{
//            String amigoSecreto = null;
//            for (Amigo a : this.amigos) {
//                if (a.getEmail().equals(emailAmigo)) {
//                    amigoSecreto = "Amigo secreto: " + a;
//                }
//            }
//            if(amigoSecreto == null){throw new AmigoInexistenteException("Amigo Inexistente");}
//
//            return amigoSecreto;
//        }
//
//        public List<Mensagem> pesquisaMensagensAnonimas() {
//            List<Mensagem> mensagensAnonimas = new ArrayList<>();
//
//            for (Mensagem m : this.mensagens) {
//                if (!m.ehAnonima()) {
//                    mensagensAnonimas.add(m);
//                }
//            }
//            return mensagensAnonimas;
//        }
//        public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
//            Amigo a = pesquisaAmigo(emailDaPessoa);
//            if( a == null){
//                throw new AmigoInexistenteException("Amigo Inexistente");
//            } else {
//                a.setEmailAmigoSorteado(emailAmigoSorteado);
//            }
//        }
//
//        public List<Mensagem> pesquisaTodasAsMensagens() {
//            return this.mensagens;
//        }
//    }
//}
