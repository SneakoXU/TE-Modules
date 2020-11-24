<template>
  <div class="main">
      <h2>Product Reviews for {{ name }}</h2>
      <p class="description">{{ description }}</p>


        <div class="well-display">
            <div class="well">
                <span class="amount">{{ averageRating }}</span>
                Average Rating
            </div>
            <div class="well">
                 <span class="amount">{{ numberOfOneStarReviews }}</span>
                1 Star Review{{ numberOfOneStarReviews === 1 ? '' : 's' }}
            </div>
            <div class="well">
                 <span class="amount">{{ numberOfTwoStarReviews }}</span>
                2 Star Review{{ numberOfTwoStarReviews === 1 ? '' : 's' }}
            </div>
            <div class="well">
                 <span class="amount">{{ numberOfThreeStarReviews }}</span>
                3 Star Review{{ numberOfThreeStarReviews === 1 ? '' : 's' }}
            </div>
            <div class="well">
                 <span class="amount">{{ numberOfFourStarReviews }}</span>
                4 Star Review{{ numberOfFourStarReviews === 1 ? '' : 's' }}
            </div>
            <div class="well">
                 <span class="amount">{{ numberOfFiveStarReviews }}</span>
                5 Star Review{{ numberOfFiveStarReviews === 1 ? '' : 's' }}
            </div>
        </div>
    <div class="review" v-for="review in reviews" v-bind:key="review.id"> 
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
          <img 
          v-for="n in review.rating"
          v-bind:key="n" 
          src="../assets/star.png"
          v-bind:title="review.rating + ' star review'"
          />
      </div>
     <!-- <p class="rating">{{ review.rating }}</p> -->
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
    </div>
  </div>
</template>

<script>
export default {
    name: 'product-reviews',
    data(){
        return{
            name: 'Cigar Party for Dummies',
            description: 'Yo you dummy, peep this to host a proper cigar party in the park for your little squirrel friends.',
            reviews: [
                {
                    reviewer: "Malcolm Gladwell",
                    title: "What a book!",
                    review: "It certainly is a book. I mean, I can see that.",
                    rating: 3,
                    favorited: false
                },
                {
                    reviewer: "Tupac",
                    title: "Rappers read books too!",
                    review: "It's an alright book. Not dope enough.",
                    rating: 2,
                    favorited: false
                },
                {
                    reviewer: "Aluminum Monster",
                    title: "ARGHHH!",
                    review: "This is paper, not aluminum!",
                    rating: 1,
                    favorited: false
                },
                {
                    reviewer: "Mickey Mouse",
                    title: "A fantastic read!",
                    review: "This book is a page turner! I hosted the perfect cigar party for all my squirrel buddies!",
                    rating: 5,
                    favorited: true
                }

            ]
        }
    },

    computed:{
        averageRating(){
            let total = this.reviews.reduce((sum, review) => {
                return sum + review.rating;
            },0);
            return total/this.reviews.length;
        },
        numberOfOneStarReviews(){
           let total = this.reviews.reduce((count, review) => {
               return count + (review.rating === 1);
           }, 0);
           return total;
        },
        numberOfTwoStarReviews(){
              let total = this.reviews.reduce((count, review) => {
               return count + (review.rating === 2);
           }, 0);
           return total;
        },
        numberOfThreeStarReviews(){
              let total = this.reviews.reduce((count, review) => {
               return count + (review.rating === 3);
           }, 0);
           return total;
        },
        numberOfFourStarReviews(){
              let total = this.reviews.reduce((count, review) => {
               return count + (review.rating === 4);
           }, 0);
           return total;
        },
        numberOfFiveStarReviews(){
              let total = this.reviews.reduce((count, review) => {
               return count + (review.rating === 5);
           }, 0);
           return total;
        }
    }

}
</script>

<style scoped>
    div.main{
        margin: 1rem;
    }
    div.review{
        background-color: aquamarine;
    }
    div.rating img{
        width: 2em;
        height: 100%;
    }
</style>