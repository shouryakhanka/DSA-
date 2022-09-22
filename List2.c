//User function Template for C

struct Node* SortedMerge(struct Node* a, struct Node* b)
{
    struct Node* result = NULL;

    if (b == NULL)
        return a;
    if (a == NULL)
        return b;
    if (a->data <= b->data)
    {
        result = a;
        result->next = SortedMerge(a->next, b);
    }
    else
    {
        result = b;
        result->next = SortedMerge(a, b->next);
    }
    return (result);
    
}