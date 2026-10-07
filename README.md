<img width="1728" height="1117" alt="Screenshot 2026-10-07 at 1 50 37 PM" src="https://github.com/user-attachments/assets/889ecd05-e8ce-4b69-a9fc-4f65ae70309d" />
<img width="1728" height="1117" alt="Screenshot 2026-10-07 at 1 50 41 PM" src="https://github.com/user-attachments/assets/2356903f-1daf-4771-b904-0a4c08909f48" />




1.	Why does the route contain an event ID instead of the complete event object?
    The ID identifies the event without passing all its data through navigation. The detail destination uses that ID to find the event in the collection.
  	
2.	Which composable owns the search state?
    EventScreen owns it through var query by rememberSaveable { mutableStateOf("") }.

3.	Why does the search value use rememberSaveable?
    It preserves the search text across activity recreation, like screen rotation, so the user does not lose their search.
  	
4.	What happens to the back stack when an event is selected?
    The event detail destination is added above the event list. Pressing Back removes the detail destination and returns to the list, such as how a stack works.
  	
5.	How does the UI request navigation without directly accessing the NavController?
    It uses callbacks such as onEventSelected(event.id) or onBack(). The navigation host supplies those callbacks and uses the NavController to perform navigation.
  	
6.	What makes the Share action an implicit intent?
    It specifies ACTION_SEND, the "text/plain" type, and the shared text without naming a specific app or component. Intent.createChooser() lets the user choose a the  app they want to share to.


No generative AI was used.
