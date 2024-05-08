// Exemplo de uso de JDBC com HSQLDB.
// Ver exemplo mais completo em: http://hsqldb.org/doc/guide/apb.html
// Uso:
//   javac ExemploJDBC.java 
//   java -cp /opt/hsqldb/lib/hsqldb.jar:. ExemploJDBC
// Obs.: ajustar a localizacao do hsqldb.jar se nao estiver em /opt/hsqldb/lib 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploJDBC {

   // Constantes para conexao com HSQLSB (modo standalone)
   static final String JDBC_DRIVER = "org.hsqldb.jdbcDriver";
   static final String DB_NAME = "acgdb";
   static final String DB_URL = "jdbc:hsqldb:file:" + DB_NAME;
   static final String DB_USER = "sa";
   static final String DB_PASSWD = "";

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
      // Carrega o driver JDBC do HSQLDB.
      // O driver hsqldb.jar deve estar no classpath.
      Class.forName(JDBC_DRIVER);

      // Conecta o programa com o banco de dados. 
      // Os arquivos do banco sao criados se nao existirem.
      Connection c = DriverManager.getConnection(DB_URL,
                                                 DB_USER,
                                                 DB_PASSWD);

      // Statement recebe comandos SQL e os executa no banco
      Statement s = c.createStatement();
      s.executeUpdate("CREATE TABLE acg (id INTEGER, descr VARCHAR(255), ch INTEGER, PRIMARY KEY(id))");
      s.executeUpdate("INSERT INTO acg VALUES(1, 'Participação na ERAD 2010', 30)");
      s.executeUpdate("INSERT INTO acg VALUES(2, 'Pesquisa no LSC', 60)");
      s.executeUpdate("INSERT INTO acg VALUES(3, 'Participação na ERRC 2009', 30)");

      // ResultSet vai conter os resultados da consulta
      ResultSet rs;
      rs = s.executeQuery("SELECT * FROM acg");
      while (rs.next())
         System.out.println(rs.getInt("id") + " " + 
                            rs.getString("descr") + " " + 
                            rs.getInt("ch"));
 
      s.execute("SHUTDOWN");
      s.close();
      c.close();
   }
}
