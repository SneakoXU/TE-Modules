<template>
  <div>
      <h1>{{ product.name }}</h1>
      <p class="description">{{ product.description }}</p>
      <div class="actions">
          <router-link v-bind:to="{name: 'products'}">Return to Products</router-link>
          <router-link v-bind:to="{name: 'add-review', params: {id: product.id}}">Add a Review</router-link>

      </div>
  </div>
</template>

<script>
export default {
    name: 'product-detail',
    components: {},
    computed: {
        product(){
            return this.$store.state.products.find( 
                prod => prod.id == this.$store.state.activeProduct
            );
        }
    },
    created(){
        const activeProductID = this.$route.params.id;
        this.$store.commit('SET_ACTIVE_PRODUCT', activeProductID);
    },


}
</script>

<style>

</style>