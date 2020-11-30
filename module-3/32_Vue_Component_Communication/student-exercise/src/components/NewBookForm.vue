<template>
  <form class="new-book-form" v-on:submit.prevent="saveBook">
    <div class="title-input">
        <label for="title">Title: </label>
        <input type="text" name="title" v-model="newBook.title"/>
    </div>
    <div class="author-input">
        <label for="author">Author: </label>
        <input type="text" name="author" v-model="newBook.author"/>
    </div>
    <div class="isbn-input">
        <label for="isbn">ISBN: </label>
        <input type="text" name="isbn" v-model="newBook.isbn"/>
    </div>
    <button type="submit" class="btn add">Add Book</button>
  </form>
</template>

<script>
export default {
    name:"new-book-form",
     data(){
      return{
        newBook: {
          title:'',
          author:'',
          read:false,
          isbn:''
        }
      }
    },
    methods:{
      saveBook(){
        this.newBook.read=false;
        this.$store.commit('ADD_NEW_CARD', this.newBook);
        this.newBook={
          title:'',
          author:'',
          read:false,
          isbn:''
        };
      }
    }
}
</script>

<style>
div{
    padding: 10px 0px;
}
</style>