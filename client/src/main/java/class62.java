public final class class62 {
   static byte[][][] field901 = new byte[4][104][104];
   static byte[][][] field910;
   static byte[][][] field916;
   static class275 archive15;
   static int field900 = (int)(Math.random() * 33.0D) - 16;
   static int field902 = 99;
   static int field912;
   static int field914 = (int)(Math.random() * 17.0D) - 8;
   static int[] field903;
   static int[][] field905;
   static int[][][] field911 = new int[4][105][105];
   static final int[] field904 = new int[]{1, -1, -1, 1};
   static final int[] field906 = new int[]{1, 0, -1, 0};
   static final int[] field908 = new int[]{1, 2, 4, 8};
   static final int[] field909 = new int[]{16, 32, 64, 128};
   static final int[] field913 = new int[]{0, -1, 0, 1};
   static final int[] field915 = new int[]{-1, -1, 1, 1};

   public static class265[] method1652() {
      return new class265[]{class265.field3196, class265.field3197, class265.field3199, class265.field3198};
   }

   static final void processPlayerUpdateGpi(PacketBuffer var0) {
      int skipCount = 0;
      var0.switchToBitAccess();

      byte[] var10000;
      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < PlayerList.localPlayerCount; ++var3) {
         var4 = PlayerList.localPlayerIndexes[var3];
         if ((PlayerList.field1175[var4] & 1) == 0) {
            if (skipCount > 0) {
               --skipCount;
               var10000 = PlayerList.field1175;
               var10000[var4] = (byte)(var10000[var4] | 2);
            } else {
               var5 = var0.readBits(1);
               if (0 == var5) {
                  skipCount = class250.method4285(var0);
                  var10000 = PlayerList.field1175;
                  var10000[var4] = (byte)(var10000[var4] | 2);
               } else {
                  class201.method3690(var0, var4);
               }
            }
         }
      }

      var0.switchToByteMode();
      if (0 != skipCount) {
         throw new RuntimeException();
      } else {
         var0.switchToBitAccess();

         for(var3 = 0; var3 < PlayerList.localPlayerCount; ++var3) {
            var4 = PlayerList.localPlayerIndexes[var3];
            if (0 != (PlayerList.field1175[var4] & 1)) {
               if (skipCount > 0) {
                  --skipCount;
                  var10000 = PlayerList.field1175;
                  var10000[var4] = (byte)(var10000[var4] | 2);
               } else {
                  var5 = var0.readBits(1);
                  if (var5 == 0) {
                     skipCount = class250.method4285(var0);
                     var10000 = PlayerList.field1175;
                     var10000[var4] = (byte)(var10000[var4] | 2);
                  } else {
                     class201.method3690(var0, var4);
                  }
               }
            }
         }

         var0.switchToByteMode();
         if (skipCount != 0) {
            throw new RuntimeException();
         } else {
            var0.switchToBitAccess();

            for(var3 = 0; var3 < PlayerList.emptyPlayerIndexCount; ++var3) {
               var4 = PlayerList.localPlayerEmptyIndexes[var3];
               if ((PlayerList.field1175[var4] & 1) != 0) {
                  if (skipCount > 0) {
                     --skipCount;
                     var10000 = PlayerList.field1175;
                     var10000[var4] = (byte)(var10000[var4] | 2);
                  } else {
                     var5 = var0.readBits(1);
                     if (var5 == 0) {
                        skipCount = class250.method4285(var0);
                        var10000 = PlayerList.field1175;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     } else if (class103.method2081(var0, var4)) {
                        var10000 = PlayerList.field1175;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     }
                  }
               }
            }

            var0.switchToByteMode();
            if (skipCount != 0) {
               throw new RuntimeException();
            } else {
               var0.switchToBitAccess();

               for(var3 = 0; var3 < PlayerList.emptyPlayerIndexCount; ++var3) {
                  var4 = PlayerList.localPlayerEmptyIndexes[var3];
                  if ((PlayerList.field1175[var4] & 1) == 0) {
                     if (skipCount > 0) {
                        --skipCount;
                        var10000 = PlayerList.field1175;
                        var10000[var4] = (byte)(var10000[var4] | 2);
                     } else {
                        var5 = var0.readBits(1);
                        if (var5 == 0) {
                           skipCount = class250.method4285(var0);
                           var10000 = PlayerList.field1175;
                           var10000[var4] = (byte)(var10000[var4] | 2);
                        } else if (class103.method2081(var0, var4)) {
                           var10000 = PlayerList.field1175;
                           var10000[var4] = (byte)(var10000[var4] | 2);
                        }
                     }
                  }
               }

               var0.switchToByteMode();
               if (0 != skipCount) {
                  throw new RuntimeException();
               } else {
                  PlayerList.localPlayerCount = 0;
                  PlayerList.emptyPlayerIndexCount = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     var10000 = PlayerList.field1175;
                     var10000[var3] = (byte)(var10000[var3] >> 1);
                     Player var6 = client.localPlayers[var3];
                     if (null != var6) {
                        PlayerList.localPlayerIndexes[++PlayerList.localPlayerCount - 1] = var3;
                     } else {
                        PlayerList.localPlayerEmptyIndexes[++PlayerList.emptyPlayerIndexCount - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }
}
