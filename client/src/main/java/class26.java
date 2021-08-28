public class class26 {
   int field204;
   int field206 = 2;
   int field207;
   int field208;
   int field209;
   int field210;
   int field211;
   int field212;
   int field213;
   int[] field203 = new int[2];
   int[] field205 = new int[2];

   class26() {
      this.field205[0] = 0;
      this.field205[1] = 65535;
      this.field203[0] = 0;
      this.field203[1] = 65535;
   }

   final void method452(Buffer var1) {
      this.field213 = var1.readUnsignedByte();
      this.field208 = var1.readInt();
      this.field207 = var1.readInt();
      this.method462(var1);
   }

   final void method462(Buffer var1) {
      this.field206 = var1.readUnsignedByte();
      this.field205 = new int[this.field206];
      this.field203 = new int[this.field206];

      for(int var2 = 0; var2 < this.field206; ++var2) {
         this.field205[var2] = var1.readUnsignedShort();
         this.field203[var2] = var1.readUnsignedShort();
      }

   }

   final void method454() {
      this.field204 = 0;
      this.field210 = 0;
      this.field211 = 0;
      this.field212 = 0;
      this.field209 = 0;
   }

   final int method455(int var1) {
      if (this.field209 >= this.field204) {
         this.field212 = this.field203[this.field210++] << 15;
         if (this.field210 >= this.field206) {
            this.field210 = this.field206 - 1;
         }

         this.field204 = (int)((double)this.field205[this.field210] / 65536.0D * (double)var1);
         if (this.field204 > this.field209) {
            this.field211 = ((this.field203[this.field210] << 15) - this.field212) / (this.field204 - this.field209);
         }
      }

      this.field212 += this.field211;
      ++this.field209;
      return this.field212 - this.field211 >> 15;
   }
}
