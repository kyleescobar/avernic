import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class14 extends class25 {
   byte[] field84;
   int field82;
   AudioFormat field81;
   SourceDataLine field83;

   class14() {
   }

   protected void method398() {
      this.field81 = new AudioFormat((float)class282.field3634, 16, class25.field199 ? 2 : 1, true, false);
      this.field84 = new byte[256 << (class25.field199 ? 2 : 1)];
   }

   protected void method399(int var1) throws LineUnavailableException {
      try {
         Info var3 = new Info(SourceDataLine.class, this.field81, var1 << (class25.field199 ? 2 : 1));
         this.field83 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field83.open();
         this.field83.start();
         this.field82 = var1;
      } catch (LineUnavailableException var4) {
         if (class125.method2245(var1) != 1) {
            this.method399(class27.method470(var1));
         } else {
            this.field83 = null;
            throw var4;
         }
      }
   }

   protected int method423() {
      return this.field82 - (this.field83.available() >> (class25.field199 ? 2 : 1));
   }

   protected void method397() {
      int var1 = 256;
      if (class25.field199) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field183[var2];
         if (0 != (var3 + 8388608 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field84[var2 * 2] = (byte)(var3 >> 8);
         this.field84[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field83.write(this.field84, 0, var1 << 1);
   }

   protected void method402() {
      if (null != this.field83) {
         this.field83.close();
         this.field83 = null;
      }

   }

   protected void method410() {
      this.field83.flush();
   }
}
