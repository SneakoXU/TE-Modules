<template>

  <div class="book-container">
    <book-card
      v-for="book in $store.state.books"
      v-bind:key="book.id"
      v-bind:book="book"
      v-bind:class="{read : book.read}" 
      />
      
    
  </div>

</template>

<script>
import BookCard from './BookCard.vue';

export default {
    name: 'reading-list',
    components: {
      BookCard  
    },
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}

.book-container .read{
  background-color: rgb(230, 227, 227);
} 
</style>