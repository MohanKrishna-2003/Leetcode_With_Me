class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            q.add(i);
        for(int i=0; i<n; i++)
        {
            arr[q.poll()] = deck[i];
            q.add(q.poll());
        }
        return arr;
    }
}