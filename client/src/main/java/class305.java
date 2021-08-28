public class class305 {
   public static char[] field3756 = new char[64];
   static char[] field3757;
   static char[] field3758;
   static class397 field3760;
   static int[] field3761;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field3756[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3756[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3756[var0] = (char)(48 + var0 - 52);
      }

      field3756[62] = '+';
      field3756[63] = '/';
      field3757 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3757[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3757[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3757[var0] = (char)(var0 + 48 - 52);
      }

      field3757[62] = '*';
      field3757[63] = '-';
      field3758 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3758[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3758[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3758[var0] = (char)(48 + var0 - 52);
      }

      field3758[62] = '-';
      field3758[63] = '_';
      field3761 = new int[128];

      for(var0 = 0; var0 < field3761.length; ++var0) {
         field3761[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field3761[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field3761[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field3761[var0] = var0 - 48 + 52;
      }

      int[] var2 = field3761;
      field3761[43] = 62;
      var2[42] = 62;
      int[] var1 = field3761;
      field3761[47] = 63;
      var1[45] = 63;
   }
}
